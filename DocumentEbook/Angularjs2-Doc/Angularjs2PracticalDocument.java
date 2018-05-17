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



4. how to show current location into google map using AGm in angulerjs2?
            OR 
    How to intregate angular 2 web app to Google map ?

=>
    Step 1 : install your anguler google maps :

            npm install @agm/core --save

    Step 2 : create google clode poject and get api key after that u have to enable that project for 
                google map javascript api 

                for help follow that blog -
                url - https://angular-maps.com/guides/getting-started/

              url :  https://console.cloud.google.com/google/maps-apis/overview?project=directed-will-204212
            url : https://developers.google.com/maps/documentation/javascript/get-api-key?hl=en#key

    Step 3 : add some code into app.module.ts file --

            import { AgmCoreModule } from '@agm/core';

            AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAxbvzHrsuVUVw9eb7qkalE6l_406T70Qc' // your Google map api key
    })

    Step 4 : after that send your longitude and latitude from home.component.ts file 

    Step 5 : after that add google map code into your home.component.html page --


            <agm-map [latitude]="lat" [longitude]="lng">
                <agm-marker [latitude]="lat" [longitude]="lng"></agm-marker>
            </agm-map>

    Step 6 : for dispaly that map we have to used some css file like home.component.css file , we have to 
            add some css contain --

                agm-map {
                    height: 300px;
                        }

5. How to add custom css and bootstrap and js file in angulerjs2 ?
=>
    Step 1 : get good bootstrap style from getbootstrap.com

    Step 2 : install bootstrap flile into e2e project fiel like --

        cd e2e 

        then run this command ---
        $ npm install --save bootstrap@3

    Step 3 :
        then modify in your project  .angular-cli.json file like this --

            .angular-cli.json 

        "styles": [
        "styles.css",
        ".././node_modules/bootstrap/dist/css/bootstrap.css"
            ],
         "scripts": [
        ".././node_modules/bootstrap/dist/js/bootstrap.js"
        ],
        
    Step 4 : then copied some bootstrap included html page and run ur application
    










