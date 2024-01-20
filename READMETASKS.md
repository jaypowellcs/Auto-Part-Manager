<h1>REQUIREMENTS</h1>

<h2>Tasks</h2>

<p>In this file, we will document all changes to the code and where to find the changes I have made for
parts C to J.</p>

<p>Each note should include the prompt, file name, line number, and change.</p>

<h2>Task B</h2>
<blockquote>
<p>Created a new readme file which will be named READMETASKS.md</p>
<p>Commited changes made to gitlabs.</p>
</blockquote>

<h2>Task C</h2>
<blockquote>
<i>Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
</i>
<p>mainscreen.html,line 14 => Changed title to Powell & Sons Auto Center </p>
<p>mainscreen.html,line 19,21,24,53,57 => Changed class to text-center</p>
<p>mainscreen.html,line 27,29,33,34,60,62,70 => Changed buttons colors</p>
<p>mainscreen.html,line 23,33,34,56, 70 => Changed to Car Parts & Cars</p>

<p>Commited changes made to gitlabs.</p>
</blockquote>

<h2>Task D</h2>
<blockquote>
<i>Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
</i>

<b>Created about.html in templates folder</b>
<p>about.html, line 5 => changed title to about us</p>
<p>about.html, line 7 => added bootstrap</p>
<p>about.html, line 11-38 => added content to html with bootstrap classes</p>

<b>Created AboutController in controllers folder</b>
<p>AboutController, line 12 => Added @Controller</p>
<p>AboutController, line 14 => Added GetMapping to return About.html</p>

<b>Created nav in mainscreen & about</b>

<p>about.html,mainscreen.html line 21-28, line 23-30, => added li classes with nav links</p>

<b>Created a new folder in static/images</b>
<p>added folders to directory images</p>

<p>Commited changes made to gitlabs.</p>
</blockquote>

<h2>Task E</h2>
<blockquote>
<i>Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
</i>

<b>Edited BootstrapData</b>

<p>BootStrapData => line 42 -> added condition if Part Database and Product Database == 0 to not add products</p>
<p>BootStrapData => line 42-47 -> added car parts with our repository conditions</p>
<p>BootStrapData => line 49-53 -> saved car parts to our repository</p>
<p>BootStrapData => line 55-59 -> added cars with our repository conditions</p>
<p>BootStrapData => line 61-65 -> saved car parts to our repository</p>
<p>BootStrapData => line 67-78 -> changed outsourced part to a new company and changed the conditions</p>

<p>Commited changes made to gitlabs.</p>

</blockquote>

<h2>Task F</h2>
<blockquote>
<i>Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
</i>

<b>Add Buy Now Button</b>

<p>mainscreen.html=> line 98-99 -> added buy now button with get request to buyController</p>

<b>Add Buy Confirmed and Buy failure html files</b>
<p>confirmationbuyerror.html => created to show when there is an error in buying</p>
<p>confirmationbuyproduct.html=> created to show when there is a success in buying an item</p>

<b>Added BuyController</b>
<p>BuyController => line 22 set the class as a controller</p>
<p>BuyController => line 25 create a new productRepository object to use its functions</p>
<p>BuyController => line 27,28 new get request with input from our buy now button</p>
<p>BuyController => line 33 check and see if the product exists if it doesn't return error</p>
<p>BuyController => line 35 check and see if the product inventory is over 0 and if not return error</p>
<p>BuyController => line 36-40 get current inv levels and decrease by one and return confirmation buy html</p>

<p>Commited changes made to gitlabs.</p>

</blockquote>