import { Component, OnInit } from '@angular/core';
import { DialogService } from 'primeng/dynamicdialog';
import { XmlViewComponent } from 'src/app/shared/components/xml-view/xml-view.component';
import { XmlListItem } from 'src/app/shared/model';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { AddZalbaOService } from '../../add-zalba-o.service';

@Component({
  selector: 'app-zalbe',
  templateUrl: './zalbe.component.html',
  styleUrls: ['./zalbe.component.scss'],
  providers: [DialogService]
})
export class ZalbeComponent implements OnInit {

  zahtevi: Array<XmlListItem>;

  constructor(
    private zahtevService : AddZalbaOService,
    private jsonxml : JsonXmlService,
    private dialogService : DialogService
  ) { }

  ngOnInit(): void {
    this.zahtevService.getZalbe()
    .subscribe((xmlStr) => {
      this.zahtevi = this.jsonxml.generateList(xmlStr, 'Zalba', 'Prezime', "Zalba");
    });
  }

  resenje(zahtev:XmlListItem) {
    this.dialogService.open(
      null,
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
