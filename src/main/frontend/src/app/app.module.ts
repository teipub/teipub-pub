import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MaterialModule } from '@angular/material';
import { FlexLayoutModule } from "@angular/flex-layout";
import { RouterModule } from '@angular/router'
import { APP_BASE_HREF } from '@angular/common';

import { AppComponent } from './app.component';
import { HomeComponent } from './home.component';
import { PostComponent } from './post.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PostComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    NgbModule.forRoot(),
    MaterialModule,
    FlexLayoutModule,
    RouterModule.forRoot([
    { path: '', component: HomeComponent},
    { path: 'post', component: PostComponent},
    { path: '**', component: HomeComponent}
    ], {useHash: true})
  ],
  bootstrap: [AppComponent],
  providers: [{provide: APP_BASE_HREF, useValue : '/' }]
})
export class AppModule {
}
