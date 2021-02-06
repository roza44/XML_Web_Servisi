import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { DynamicDialogConfig, DynamicDialogRef } from 'primeng/dynamicdialog';
import { obavestenje } from 'src/app/shared/xml-models';
import { ObavestenjeService } from '../../obavestenje.service';

declare const Xonomy: any;

@Component({
  selector: 'app-add-obavestenje',
  templateUrl: './add-obavestenje.component.html',
  styleUrls: ['./add-obavestenje.component.scss']
})
export class AddObavestenjeComponent implements OnInit {
  submitted: boolean;
  forWho: string;

  constructor(
    public ref: DynamicDialogRef,
    public config: DynamicDialogConfig,
    private obavestenjeService: ObavestenjeService,
    private messageService : MessageService
  ) { 
    this.forWho = this.config.data.forWho;
    this.submitted = false;
  }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.render(obavestenje, editor, null);
    this.ref.onClose.subscribe(() => {
        if(!this.submitted) { Xonomy.harvest() }
      }
    );
  }

  submit() {
    this.submitted = true;

    this.obavestenjeService.addObavestenje(Xonomy.harvest(), this.forWho)
    .subscribe(() => {
      this.messageService.add({
        severity: 'success',
        summary: 'Successful added: "Obavestenje"!',
        detail: `Your "Obavestenje" has been successfuly added!`
      });
      this.ref.close();
    });
  }
}
