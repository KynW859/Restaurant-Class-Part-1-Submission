# Restaurant-Class-Part-1-Submission

CHANGES AND FEATURES:

Application file
- Added Application file with main method, which instantiates a restaurant object and ArrayList.
- Gave Application JOptionPane variables that accept input from user. type of input is specified through dialog.
- Input values are used as arguments to a constructor method from the restaurant class.
- Afterwards, calls a toString method to present the result as a combined string
- the Restaurant object is also added to the ArrayList at the end.

Restaurant class file
- Removed most of the hard coded content in Restaurant class (old code has been commented out and moved to the bottom)
- Added proper fields to restaurant Class (Name, wait time, star rating, price ranges, and working hours)
- Added the restaurantConstructor method, which builds a restaurant object with values based on the fields.
- Added getter + setter methods for the respective fields (though setter methods are unused as of now)
- The getPriceAvg getter method simpily uses priceMin & priceMax and divides them by 2
- Added toString method with @Override. This called the getter methods and present the data in a compact way.
