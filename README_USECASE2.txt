Refactoring:
	- Discovered that Singleton implementation of controller is not conducive to an inheretance structure.
	  Attempted to create Parent controller class, but it made it impossible to share methods since only
	  one of each could exist in memory at any given time. Author -> Jason.
	- Converted Account.java to Parent class rather than interface. Allowed me to cut down on the total
	  amount of code reimplementation. Author -> Jason.

Use Case 2:
	- Actually added two more use cases. Shreyas contributed a QR code reader/writer for our Ride Tickets 
	  and Shih-Hsun contributed the food ordering UI. I was responsible for adding them into the overall
	  application and ensuring that the updates would function cross platform (i.e. not writing QR codes
	  to specific file path that only exists on one group partners' computer)
		> High-level of Ordering Food: Launch Dialog, put in the options you want, new dialog tells
		  you how much you owe. Authors -> Shreyas and Jason. 
		> High-level of Show Ride Ticket: Create new ticket QR code, load it in to a Java Swing ImageIcon
		  and display it to the user. QR code generation is accomplished through an external third-party 
		  library. Authors -> Shih-Hsun and Jason.

Contribution:

- Jason C. Nucciarone: Updates to Views and current Controllers, refactoring of code base (specifically eliminating
		       the OOP abuser account creation process), implementing code into current project, testing to
		       ensure that deliverable works.
- Shreyas: QR code model classes. Implemented third-party library to read/write QR codes.
- Shih-Hsun: Wrote Controller and Views for ordering food use case.
- Madison: Absent from this deliverable (I don't know if something came up, but she has contributed in the past)
- Aliana: Hit a deer on her way home so out of comission, but I will let her talk to you about that.

Next Steps:
	- Improve usability of application, refine model classes for better data managment, modularize code for the
	  views, and add ability for flatfile to track application configuration.
