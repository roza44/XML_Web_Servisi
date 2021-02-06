import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { DynamicDialogConfig, DynamicDialogRef } from 'primeng/dynamicdialog';
import { ObavestenjeService } from '../../obavestenje.service';

declare const Xonomy: any;

@Component({
  selector: 'app-add-obavestenje',
  templateUrl: './add-obavestenje.component.html',
  styleUrls: ['./add-obavestenje.component.scss']
})
export class AddObavestenjeComponent implements OnInit {

  xmlStr: string;
  submitted: boolean;

  constructor(
    public ref: DynamicDialogRef,
    public config: DynamicDialogConfig,
    private obavestenjeService: ObavestenjeService,
    private messageService : MessageService
  ) { 
    this.xmlStr = this.config.data.xmlStr;
    this.submitted = false;
  }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.render(this.xmlStr, editor, null);
    this.ref.onClose.subscribe(() => {
        if(!this.submitted) { Xonomy.harvest() }
      }
    );
  }

  submit() {
    this.submitted = true;

    this.obavestenjeService.addObavestenje(Xonomy.harvest())
    .subscribe(() => {
      this.messageService.add({
        severity: 'success',
        summary: 'Successful added: "Obavestenje"!',
        detail: `Your "Obavestenje" has been successfuly added!`
      });
    });
  }
}
