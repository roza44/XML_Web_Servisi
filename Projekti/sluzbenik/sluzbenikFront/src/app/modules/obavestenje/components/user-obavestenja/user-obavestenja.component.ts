import { Component, OnInit } from '@angular/core';
import { DialogService } from 'primeng/dynamicdialog';
import { XmlViewComponent } from 'src/app/shared/components/xml-view/xml-view.component';
import { XmlListItem } from 'src/app/shared/model';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { ObavestenjeService } from '../../obavestenje.service';

@Component({
  selector: 'app-user-obavestenja',
  templateUrl: './user-obavestenja.component.html',
  styleUrls: ['./user-obavestenja.component.scss'],
  providers: [DialogService]
})
export class UserObavestenjaComponent implements OnInit {

  zahtevi: Array<XmlListItem>;

  constructor(
    private obavestenjeService : ObavestenjeService,
    private jsonxml : JsonXmlService,
    private dialogService : DialogService
  ) { }

  ngOnInit(): void {
    this.obavestenjeService.getUserObavestenja()
    .subscribe((xmlStr) => {
      this.zahtevi = this.jsonxml.generateList(xmlStr, 'Obavestenje', 'Prezime', 'Obavestenje');
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
