import { Component, OnInit } from '@angular/core';
import { DialogService } from 'primeng/dynamicdialog';
import { XmlViewComponent } from 'src/app/shared/components/xml-view/xml-view.component';
import { XmlListItem } from 'src/app/shared/model';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { ResenjeService } from '../../resenje.service';

@Component({
  selector: 'app-poverenik-resenja',
  templateUrl: './poverenik-resenja.component.html',
  styleUrls: ['./poverenik-resenja.component.scss'],
  providers: [DialogService]
})
export class PoverenikResenjaComponent implements OnInit {

  zahtevi: Array<XmlListItem>;

  constructor(
    private resenjeService : ResenjeService,
    private jsonxml : JsonXmlService,
    private dialogService : DialogService
  ) { }

  ngOnInit(): void {
    this.resenjeService.getPoverenikResenja()
    .subscribe((xmlStr) => {
      this.zahtevi = this.jsonxml.generateList(xmlStr, 'Resenje', 'Prezime', 'Resenje');
    });
  }

  pregled(zahtev:XmlListItem) {
      this.dialogService.open(
        XmlViewComponent,
        {
          data: {
              xmlStr: zahtev.xml
          },
          header: zahtev.name,
          width: '40%',
          dismissableMask: true
      }
    );
  }

}
