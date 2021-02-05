import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { zalbaNaOdluku, zalbaNaOdlukuSpec } from '../../../../shared/xml-models'
import { AddZalbaOService } from '../../add-zalba-o.service';

declare const Xonomy: any;

@Component({
  selector: 'app-add-zalba-o',
  templateUrl: './add-zalba-o.component.html',
  styleUrls: ['./add-zalba-o.component.scss']
})
export class AddZalbaOComponent implements OnInit {

  constructor(
    private service : AddZalbaOService,
    private messageService : MessageService
  ) { }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.setMode("laic");
    Xonomy.render(zalbaNaOdluku, editor, zalbaNaOdlukuSpec);
  }

  submit():void {
    var xml = Xonomy.harvest();
    this.service.addZalbaNaOdluku(xml).subscribe(() => {
      this.messageService.add({ severity: 'success',
      summary: 'Successful added: "Zalba na odluku"!',
      detail: `Your "Zalba na odluku" has been successfuly added!`});
    });
  }

}
