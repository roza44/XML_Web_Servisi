import { Component, OnInit } from '@angular/core';
import { DialogService } from 'primeng/dynamicdialog';
import { XmlViewComponent } from 'src/app/shared/components/xml-view/xml-view.component';
import { XmlListItem } from 'src/app/shared/model';
import { JsonXmlService } from 'src/app/shared/services/jsonxml.service';
import { ZahtevService } from '../../zahtev.service';

@Component({
  selector: 'app-user-zahtevi',
  templateUrl: './user-zahtevi.component.html',
  styleUrls: ['./user-zahtevi.component.scss'],
  providers: [DialogService]
})
export class UserZahteviComponent implements OnInit {

  zahtevi: Array<XmlListItem>;

  constructor(
    private zahtevService : ZahtevService,
    private jsonxml : JsonXmlService,
    private dialogService : DialogService
  ) { }

  ngOnInit(): void {
    this.zahtevService.getUserZahtevi()
    .subscribe((xmlStr) => {
      this.zahtevi = this.jsonxml.generateList(xmlStr, 'Zahtev', 'Prezime', 'Zahtev');
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
