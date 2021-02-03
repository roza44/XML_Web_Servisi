import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JsonXmlService {

  private options;
  private converter;

  constructor() {
    this.converter = require('xml-js');
    this.options = {compact: true, ignoreComment: true };
   }

  json2xml (root: string, jsonObj: any) {
    let xml =  this.converter.js2xml(jsonObj, this.options);
    xml = `<${root}>${xml}</${root}>`;
    return xml;
  }

  xml2json (xmlStr: string) {
    return this.converter.xml2js(xmlStr, this.options);
  }
  
}
