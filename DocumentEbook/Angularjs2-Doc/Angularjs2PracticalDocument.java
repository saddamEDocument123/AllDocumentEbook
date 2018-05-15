/****



 */

 1. How to create new project in angularJs 2?
 =>
    Step 1. Set up the Development Environment 
        npm install -g @angular/cli

    Step 2. Create a new project 
        ng new my-app

    Step 3: Serve the application 
        ng serve


2. How to redirect to login page or home page 
=>
    Step 1. crete home.component.html and home.component.ts file
    like -
    home.component.html page - 
            <html>
                <body>

                <h1>Home Page</h1>

                <p>This is home page!!</p>

                </body>
            </html>

    home.component.ts file -- 

        import { Component , Input } from '@angular/core'
        @Component({
            selector: 'my-log',
            templateUrl: './home.component.html',
            //styleUrls:['../CSS/login.component.css'],
            
        //providers:[LoginService]
        })
        export class HomeComponent{

        }

    Step 2: In app.component.html page write redirect code like -
    app.component.html page --


        <div>
        <router-outlet></router-outlet>
        
        </div>

    Step 3 : crete new app.route.ts file --

            import { Routes, RouterModule } from '@angular/router';

            import{AppComponent} from'./app.component';
            import{HomeComponent}from'./Home/home.component';

            const APP_ROUTES = [
            {
                    path: '',
                    redirectTo: '/home',
                    pathMatch: 'full'
            },
            {
                    path: 'home',
                    component: HomeComponent        
            }

            ];


            export const AppRoutingModule = RouterModule.forRoot(APP_ROUTES);

    Step 4: import some  code in app.module.ts file --


            import { AppComponent } from './app.component';

            import{HomeComponent}from'./Home/home.component';

            import{CommonModule}from'@angular/common';
            import{AppRoutingModule} from'./app.route';


            @NgModule({
            declarations: [
                AppComponent,HomeComponent
            ],
            imports: [
                BrowserModule,
                AppRoutingModule 
            ],
            providers: [],
            bootstrap: [AppComponent]
            })
            export class AppModule { }


3. How to get current latitude and longitude using angulerjs2 ?
=>
    Step 1 : call getCurrentLocation inbuild fuction in component file 


                lat:any;
                lon:any;

                getLocation() {
                navigator.geolocation.getCurrentPosition((position) => { 
                    console.log("Got position", position.coords);
                    this.lat = position.coords.latitude; 
                    this.lon = position.coords.longitude;
                    console.log(this.lat +" "+this.lon)

    Step 2 : and define longitude and latitude in html page like---

        <html>
        <div class="row">      
                <button (click)="getLocation()"  class="btn waves-effect waves-light"  type="submit">GetLocation</button> <a><h5>Get Your Current Location</h5></a>
                    </div>

                    <div class="form-group">
                            <label class="col-sm-3 control-label">Current Latitude:<sup class="sup-color"></sup></label>
                            {{lat}}

                         </div>

                         <div class="form-group">
                                <label class="col-sm-3 control-label">Current longitude:<sup class="sup-color"></sup></label>
                                {{lon}}
    
                             </div>
                       
        </html>



    










