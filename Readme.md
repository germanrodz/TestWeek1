Test 1:
1.	What set of commands are executed to push a repo on Github?
	 Git push <remotename><tagname>
	Git push <remotename>:<remotebrach>
2.	Where the strings.xml in the project structure?
	Inside the res folder
3.	What is the difference between SP and DP?
	Sp = work like dp but scales with the font size.
	Dp = relative to a 160 dpi. 1 dp is 160dpi.
4.	How can you support multiple languages in your app? Explain step by step process.
	Res folder
	Values folder
	<string name = “hello_world:>Hello World!</string>
	<string name = “hello_world>Hola Mundo!</string>
5.	What is the difference between match_parent and wrap_content?
	Match_parent = match width and height
	Wrap_parent = wants be to as big as the content.
6.	How can you setup a method for a button click without binding the view?
	Button.setONclicklistener
7.	How can you define a button click method with binding the button view?

8.	How can you change the color of the TextView?
	textColor
9.	Where are all the colors in the android architecture saved?
	Res/color
10.	How would you add a different layout for a landscape and a language? Name the qualifiers.
       ocal
11.	How would you make the keyboard hide for EditText when the activity is created?
property enable false
12.	What are ViewGroups and Views?
	Viewgroups is the base class that  contains views

13.	What attribute is necessary in a linear layout if there are more than one child views?
	id
14.	In which case you would use a Linear layout and a Relative layout?
	Relative layouts you can position items everywhere
	Linear layouts you can position the items vertical or horizontal in order

15.	How would you load an image in a ImageView from xml and programmatically?
	<ImageView
	id
	height
	width/>

16.	List all the states in an activity lifecycle.
	onResume
	onCreate
	onStart
	onDestroy
	onPause
	onStop
17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
	First Activity onCreate()
	onStart()
	 onResume()
	onPause()
	 nStop()
	 Second Activity
  	onCreate()
	onStart()
	onResume()

18.	How to restrict an activity from changing the orientation?
    manifest congichanges
19.	Which method is called to persist the data before the activity is destroyed?
    onSavedInstanceState
20.	What is the argument of that method?
    outstate
21.	How do we save the data in the method?
    savestate
22.	How to get that data back? What is the name of the method?
    onActivityCreate
23.	What is a bundle? What can a bundle contain?
	Is used to pass data thru different activities
24.	What is the difference between onPause and onStop?
	onStop another activity come into the foreground
	onPause called when other activity is complete visible
25.	How to start an activity for getting a result back?

26.	Which callback is used get the result back in the above case?
    onActivityCreate
27.	What are difference types of Intent? What are the difference between them? When do we use each of them?
	Intent explicit = user tells android what to do
	Intent implicit = android display different option the user can use
28.	How to communicate data between activities?
	Need to create a intent
29.	How to add data to an intent?
	getExtra
30.	What kind of data can be added to an intent?
	Parcelable
	serializable
31.	How to get the data sent from activity one in activity two?
	Intent bundle
32.	What is context?
	Is the current state of the application
33.	Name different kinds of layouts in Android?
	Relative_layout
	Linear_layout
34.	How to send an object through an Intent?
	getExtra()
35.	What is Serializable?
	A method that change the object to a sequence of bytes
	Java does the work


36.	What is Parcelable?
	Android studio does the work

37.	Which is better and why?
	parcelable
38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
39.	Can we avoid implementing methods using Parcelable?

40.	What are launch modes? Explain each one of them in detail.
	Singletop
	SingleTask
	Default
	SingleInstance
41.	What is back stack?
	Is call method so the application can  return to the previos activity
	Is a call to make the application witch activies or fragments
42.	How to we create a .apk file?
	We go to Build them select Build apk
43.	How to create and signed .apk file
	we got to build them generate signed apk
