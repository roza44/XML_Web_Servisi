import { Component, Input, OnInit } from '@angular/core';
import { DynamicDialogRef } from 'primeng/dynamicdialog';
import { DynamicDialogConfig } from 'primeng/dynamicdialog';

declare const Xonomy: any;

@Component({
  selector: 'app-xml-view',
  templateUrl: './xml-view.component.html',
  styleUrls: ['./xml-view.component.scss']
})
export class XmlViewComponent implements OnInit {

  xmlStr: string;

  constructor(
    public ref: DynamicDialogRef,
    public config: DynamicDialogConfig,
  ) { 

    this.xmlStr = this.config.data.xmlStr;
  }

  ngOnInit(): void {
    var viewer = document.getElementById("viewer");
    Xonomy.render(this.xmlStr, viewer, null);
    this.ref.onClose.subscribe(Xonomy.harvest());
  }

}
