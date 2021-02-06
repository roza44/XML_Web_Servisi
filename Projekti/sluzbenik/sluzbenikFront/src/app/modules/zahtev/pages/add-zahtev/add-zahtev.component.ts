import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { ZahtevService } from '../../zahtev.service';
import { zahtev, zahtevSpec } from '../../../../shared/xml-models';

declare const Xonomy: any;

@Component({
  selector: 'app-add-zahtev',
  templateUrl: './add-zahtev.component.html',
  styleUrls: ['./add-zahtev.component.scss']
})
export class AddZahtevComponent implements OnInit {

  constructor(
    private zahtevService: ZahtevService,
    private messageService: MessageService
  ) { }

  ngOnInit(): void {
    let zahtevEditor = document.getElementById('zahtevEditor');
    Xonomy.setMode('laic');
    Xonomy.render(zahtev, zahtevEditor, zahtevSpec);
  }

  submit(): void {
    let xml = Xonomy.harvest();
    this.zahtevService.addZahtev(xml).subscribe(() => {
      this.messageService.add({
        severity: 'success',
        summary: 'Successful added: "Zahtev za informacijama"!',
        detail: `Your "Zahtev" has been successfuly added!`
      });
    });
  }
}
