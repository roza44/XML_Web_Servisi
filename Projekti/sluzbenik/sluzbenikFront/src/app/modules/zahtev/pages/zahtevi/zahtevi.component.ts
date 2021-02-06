import { Component, OnInit } from '@angular/core';
import { XmlListItem } from 'src/app/shared/model';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { ZahtevService } from '../../zahtev.service';
import { DialogService } from 'primeng/dynamicdialog';
import { XmlViewComponent } from 'src/app/shared/components/xml-view/xml-view.component';
import { AddObavestenjeComponent } from 'src/app/modules/obavestenje/components/add-obavestenje/add-obavestenje.component';

@Component({
  selector: 'app-zahtevi',
  templateUrl: './zahtevi.component.html',
  styleUrls: ['./zahtevi.component.scss'],
  providers: [DialogService]
})
export class ZahteviComponent implements OnInit {

  zahtevi: Array<XmlListItem>;

  constructor(
    private zahtevService : ZahtevService,
    private jsonxml : JsonXmlService,
    private dialogService : DialogService
  ) { }

  ngOnInit(): void {
    this.zahtevService.getZahtevi()
    .subscribe((xmlStr) => {
      this.zahtevi = this.jsonxml.generateList(xmlStr, 'Zahtev', 'Prezime');
    });
  }

  obavestenje(zahtev:XmlListItem) {
    this.dialogService.open(
      AddObavestenjeComponent,
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
