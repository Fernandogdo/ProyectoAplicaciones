import { Component, OnInit } from '@angular/core';
declare function  initPlugins(): any;
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    initPlugins();
  }

}
