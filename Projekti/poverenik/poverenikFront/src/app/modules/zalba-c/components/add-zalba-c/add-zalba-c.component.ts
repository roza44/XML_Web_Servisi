import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MessageService } from 'primeng/api';
import { zalbaNaCutanje, zalbaNaCutanjeSpec } from 'src/app/shared/xml-models';
import { ZalbaCService } from '../../zalba-c.service';

declare const Xonomy: any;

@Component({
  selector: 'app-add-zalba-c',
  templateUrl: './add-zalba-c.component.html',
  styleUrls: ['./add-zalba-c.component.scss']
})
export class AddZalbaCComponent implements OnInit {

  constructor(
    private service : ZalbaCService,
    private messageService : MessageService,
  ) { }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.setMode("laic");
    Xonomy.render(zalbaNaCutanje, editor, zalbaNaCutanjeSpec);
  }

  submit():void {
    var xml = Xonomy.harvest();
    this.service.addZalbaNaCutanje(xml).subscribe(() => {
      this.messageService.add({ severity: 'success',
      summary: 'Successful added: "Zalba na cutanje"!',
      detail: `Your "Zalba na cutanje" has been successfuly added!`});
    });
  }

}
