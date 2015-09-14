# Layout-to-Image
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Layout--to--Image-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1800) 
[![API](https://img.shields.io/badge/API-8%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=8)

[![Android Gems](http://www.android-gems.com/badge/vipulasri/Layout-to-Image.svg)](http://www.android-gems.com/lib/vipulasri/Layout-to-Image)

Android Layout Xml File Containing any Parent Layout (Relative Layout, Linear Layout etc) to Image

![Layout-to-Image](https://github.com/vipulasri/Layout-to-Image/blob/master/header.png)

### Screenshot of Sample Application

![Screenshot](https://github.com/vipulasri/Layout-to-Image/blob/master/Screenshot1.png)

## Quick Setup

### 1. Include library

**Automatically with Gradle**

``` gradle
dependencies {
    compile 'com.github.vipulasri.layouttoimage:library:1.0.0'
}
```

#### Manual:
**Manual - Using [Android Studio](https://developer.android.com/sdk/installing/studio.html):**
 * Download the library folder and import to your root application folder. 
You can manually achieve this step with 3 steps: 
    1. Paste the folder library into your application at the same level of your app, build and gradle folder
    2. Add to your settings.gradle file the following code line:
    "include ':app', ':library'"
    3. Rebuild the project
 * File → Project Structure → in Modules section click on "app" → Click on tab "Dependecies" → Click on the green plus → Module Dependecy → Select ":library"
 * Done 
 
 ### 2. Usage
 
``` java

    Layout_to_Image layout_to_image;  //Create Object of Layout_to_Image Class

    RelativeLayout relativeLayout;   //Define Any Layout

    Bitmap bitmap;                  //Bitmap for holding Image of layout
    
    //provide layout with its id in Xml
    
    relativeLayout=(RelativeLayout)findViewById(R.id.container);  
    
    //initialise layout_to_image object with its parent class and pass parameters as (<Current Activity>,<layout object>)    
    
    layout_to_image=new Layout_to_Image(MainActivity.this,relativeLayout);
    
    //now call the main working function ;) and hold the returned image in bitmap
    
    bitmap=layout_to_image.convert_layout();

```

## License


    The MIT License (MIT)

    Copyright (c) 2015 Vipul Asri

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
