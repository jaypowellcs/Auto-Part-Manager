<h1>REQUIREMENTS</h1>

<h2>Tasks</h2>

<p>In this file, we will document all changes to the code and where to find the changes I have made for
parts C to J.</p>

<p>Each note should include the prompt, file name, line number, and change.</p>

<h2>Task B</h2>
<blockquote>
<p>Created a new readme file which will be named READMETASKS.md</p>
<p>Committed changes made to gitlabs.</p>
</blockquote>

<h2>Task C</h2>
<blockquote>
<i>Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
</i>
<p>mainscreen.html,line 14 => Changed title to Powell & Sons Auto Center </p>
<p>mainscreen.html,line 19,21,24,53,57 => Changed class to text-center</p>
<p>mainscreen.html,line 27,29,33,34,60,62,70 => Changed buttons colors</p>
<p>mainscreen.html,line 23,33,34,56, 70 => Changed to Car Parts & Cars</p>

<p>Committed changes made to gitlabs.</p>
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

<p>Committed changes made to gitlabs.</p>
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

<p>Committed changes made to gitlabs.</p>

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

<p>Committed changes made to gitlabs.</p>

</blockquote>

<h2>Task G</h2>
<blockquote>
<i>Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
</i>

<b>Add maxInv and minInv to Part</b>

<p>Domain/Part line 28-32 => Created a minInv and maxInv levels with messages stating that these values could never be negative</p>
<p>Domain/Part line 46-60 => Added maxInv and minInv to constructors</p>
<p>Domain/Part line 107-120 => Created Getter & Setter for maxInv and MinInv</p>

<b>Added maxInv and minInv to BootstrapData</b>

<p>BootstrapData line 42-47 => added min and max inventory levels</p>

<b>Added maxInv and minInv to mainscreen.html</b>

<p>mainscreen.html line 51-52 => added min and max inventory levels headers</p>
<p>mainscreen.html line 61-62 => added min and max inventory levels values to the tables</p>


<b>Added minInv and maxInv fields to InHousePart and OutSourcedPart</b>

<p>InhousePartForm line 23-25 => added fields for min and max values parts</p>
<p>OutsoucedPartForm line 25-27 => added fields for min and max values parts</p>

<b>Changed Database name to CarDb</b>

<p>Templates/Application.properties line 7 => changed DB name to CarDb</p>

<b>Created method in Part.java to check if inventory level is between min and max</b>
<p>Part.java line 139-145 => created method to return boolean if inv is within range</p>


<b>Created new html file to display error</b>
<p>resouces/templates/inventoryerror.html line 8-9 => added content to show error for inventory levels</p>

<b>Created validation check in AddOutSourcedPartController.java</b>
<p>AddOutsourcedPartController.java line 51-55 => validation check</p>

<b>Created validation check in AddInHousePartController.java</b>
<p>AddInhousePartController.java line 49-55 => validation check</p>

<p>Committed changes made to gitlabs.</p>
</blockquote>

<h2>Task H</h2>
<blockquote>
<i>Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
</i>

<b>Added html files</b>

<p>templates/lowinventoryerror => line 6-10 -> created file to show error when inventory is trying to be inputted is lower then it should be</p>
<p>templates/maxinventoryerror => line 6-10 -> created file to show error when inventory is trying to be inputted is higher then it should be</p>

<b>Changed OutsourcedPartController & AddInhousePartController to show errors on max and low inventory</b>
<p>AddOutsourcedPartController line 54-57 => conditional statement to check if user is trying to put in to low or too high invenotry</p>
<p>AddInHousePartController line 51-55 => conditional statement to check if user is trying to put in to low or too high invenotry</p>

<b>Changed EnufPartsValidator.java</b>
<p>EnufPartsValidator.java line 36 => changed it so that it won't allow the user to buy product when there is one below the min inventory</p>

<p>Committed changes made to gitlabs.</p>

</blockquote>

<h2>Task I</h2>
<blockquote>
<i>Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
</i>

<b>Added units tests to PartTest</b>
<p>PartTest line 161-176 => added unit tests to test the max and min fields</p>
<p>Ran both tests and finished with exit code 0</p>

<p>Committed changes made to gitlabs.</p>

</blockquote>


<h2>Task J</h2>
<blockquote>
<i>Remove the class files for any unused validators in order to clean your code.
</i>

<b>Removed unused validators</b>
<p>ValidDeletePart.java line 13 & line 14 => they had no usages so deleted them from the file.</p>

<p>Committed changes made to gitlabs.</p>

</blockquote>