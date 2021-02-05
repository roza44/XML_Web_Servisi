import { Component, OnInit } from '@angular/core';
import { zalbaNaOdluku, zalbaNaOdlukuSpec } from '../../../../shared/xml-models'

declare const Xonomy: any;

@Component({
  selector: 'app-add-zalba-o',
  templateUrl: './add-zalba-o.component.html',
  styleUrls: ['./add-zalba-o.component.scss']
})
export class AddZalbaOComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    var editor = document.getElementById("editor");
    Xonomy.setMode("laic");
    Xonomy.render(zalbaNaOdluku, editor, zalbaNaOdlukuSpec);
  }

}
