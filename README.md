**Image Receipt Processing**

**Overview**

Image Receipt Processing is a proof-of-concept OCR-based application developed using Java and Tesseract OCR. The application processes receipt images, extracts relevant expense information, and generates structured output for further analysis and storage.
The primary objective of this project is to automate the extraction of expense details from receipt images by leveraging Optical Character Recognition (OCR) technology.

**Problem Statement**
Users often receive receipts in physical form after making purchases. Manually recording expense information from these receipts can be time-consuming and error-prone.
This project aims to simplify the process by allowing users to upload a receipt image and automatically extract key information such as:
- Store Name
- Date
- Total Amount
The extracted data is then displayed in a structured format and exported as a JSON file.

**Features**

Version 1

- Receipt Image Processing
- OCR-based Text Extraction using Tesseract
- Store Name Extraction
- Date Extraction
- Total Amount Extraction
- Structured Console Output

Version 2

- JSON Generation using Jackson Databind
- Export Extracted Data to JSON File
- Organized Output Storage


**Technology Stack**

**Technology       Purpose**
Java 17         | Core Application Development
Maven           | Dependency Management
Tess4J          | Java Wrapper for Tesseract OCR
Tesseract OCR   | Optical Character Recognition
Jackson Databind| JSON Serialization
IntelliJ IDEA   | Development Environment

**Project Architecture**

Receipt Image
      │
      ▼
Tesseract OCR
      │
      ▼
Raw Text Extraction
      │
      ▼
Receipt Parser
      │
      ├── Extract Store Name
      ├── Extract Date
      └── Extract Total Amount
      │
      ▼
Receipt Object
      │
      ├── Console Output
      └── JSON Export
              │
              ▼
         receipt.json


**Project Structure**

Image Receipt Processing
│
├── src
│   └── main
│       └── java
│           └── org
│               └── example
│                   ├── Receipt.java
│                   ├── ReceiptParser.java
│                   ├── JSONExporter.java
│                   ├── OCRTest.java
│                   └── ReceiptOCRApp.java
│
├── receipts
│   └── Sample Receipt Images
│
├── output
│   └── receipt.json
│
├── pom.xml
├── README.md
└── .gitignore



**Working Flow**
Step 1: Upload Receipt Image
The user provides a receipt image to the application.

Step 2: OCR Processing
Tesseract OCR reads the image and converts it into raw text.

Step 3: Data Extraction
Regular Expressions (Regex) are used to identify and extract:
- Store Name
- Date
- Total Amount

Step 4: Object Creation
The extracted values are stored in a Receipt object.

Step 5: Output Generation
The application:
- Displays the extracted information in the console
- Generates a JSON file containing the extracted details

**Sample Input**

ABC Supermarket
Date: 08/06/2026

Milk      120
Bread      50
Butter     80
Total     250

**Sample Console Output**
Receipt Processed Successfully
Store Name : ABC Supermarket
Date       : 08/06/2026
Total      : 250.0

**Sample JSON Output**

{
  "storeName": "ABC Supermarket",
  "date": "08/06/2026",
  "totalAmount": 250.0
}

**Challenges Faced**
- Installing and configuring Tesseract OCR
- Managing OCR dependencies using Maven
- Handling variations in receipt formats
- Designing reliable Regex patterns for data extraction
- Generating structured JSON output

**Future Enhancements**
- Item-wise Product Extraction
- Invoice Number Detection
- GST/Tax Extraction
- Payment Method Identification
- Receipt Categorization
- Spring Boot REST API Integration
- Database Storage
- Dashboard and Analytics

**Conclusion**

This project demonstrates the practical application of OCR technology for automated receipt processing. By combining Tesseract OCR, Java, Regex-based parsing, and JSON generation, the solution successfully extracts key expense information from receipt images and presents it in a structured format.
The project serves as a foundation for more advanced expense management and document processing systems.
