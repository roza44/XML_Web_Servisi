import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { DialogService, DynamicDialogConfig, DynamicDialogRef } from 'primeng/dynamicdialog';
import { resenje, resenjeeSpec } from 'src/app/shared/xml-models';
import { ResenjeService } from '../../resenje.service';

declare const Xonomy: any;

@Component({
  selector: 'app-add-resenje',
  templateUrl: './add-resenje.component.html',
  styleUrls: ['./add-resenje.component.scss'],
  providers: [DialogService]
})
export class AddResenjeComponent implements OnInit {

  submitted: boolean;
  forWho: string;

  constructor(
    public ref: DynamicDialogRef,
    public config: DynamicDialogConfig,
    private resenjeService: ResenjeService,
    private messageService : MessageService
  ) { 
    this.forWho = this.config.data.forWho;
    this.submitted = false;
  }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.render(resenje, editor, resenjeeSpec);
    this.ref.onClose.subscribe(() => {
        if(!this.submitted) { Xonomy.harvest() }
      }
    );
  }

  submit() {
    this.submitted = true;

    this.resenjeService.addResenje(Xonomy.harvest(), this.forWho)
    .subscribe(() => {
      this.messageService.add({
        severity: 'success',
        summary: 'Successful added: "Resenje"!',
        detail: `Your "Resenje" has been successfuly added!`
      });
      this.ref.close();
    });
  }

}
