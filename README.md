# Invoice_Generation_Software-Java_Project

Overview
The Invoice Generation System is a Java-based application designed to streamline the process of calculating taxes and generating invoices for purchased products. It leverages predefined tax categories, tax groups, and products to ensure quick setup and ease of use. The system allows users to select products, calculates applicable taxes, and generates a comprehensive invoice.

Features
Predefined Taxes and Tax Groups: Includes various taxes like VAT, SGST, CGST, Luxury Tax, and Service Tax. Tax groups are defined to bundle relevant taxes together for easier application.

Predefined Products: The system comes with a list of predefined products, such as Rice, Petrol, Soap, Luxury Car, Consulting Service, Milk, Laptop, and Chair. Each product has an associated price and tax group.

User Interaction: Users can select products from the predefined list via a console-based interface. The system robustly handles user input to prevent errors.

Invoice Generation: Calculates total price and applicable taxes for selected products and generates a detailed invoice showing product details, total price, total tax, and grand total.

Implementation Details
Tax.java: Manages a map of predefined taxes with their percentages and provides methods to retrieve tax details.

TaxGroup.java: Manages a map of tax groups, each containing a list of applicable taxes, and provides methods to retrieve group details.

Product.java: Contains a map of predefined products with their details and provides methods to access this information.

ProductDetails.java: Defines the structure for product details, including price and tax group.

InvoiceGenerator.java: Handles the core functionality, including user input, product selection, tax calculation, and invoice generation.

Usage
Clone the repository and navigate to the project directory.
Compile and run the InvoiceGenerator class.
Follow the prompts to select products. Type 'done' when finished.
View the generated invoice with detailed calculations.
