# com.cdsoftware.lirion.structure
- Copyright: 2026 https://www.casadelsoftware.com
- Repository: https://bitbucket.org/cdsoftware/com.cdsoftware.lirion.structure.git
- License: GPL 2

## Description
The `com.cdsoftware.lirion.structure` plugin is a custom extension for iDempiere. It extends standard system capabilities by providing event handlers, column callouts, database models, and Application Dictionary configurations (2Pack) to support customized business workflows.

## Contributors
- 2026 Casa del Software <info@casadelsoftware.com>

## Components
- iDempiere Plugin [com.cdsoftware.lirion.structure](com.cdsoftware.lirion.structure)
- iDempiere Unit Test Fragment [com.cdsoftware.lirion.structure.test](com.cdsoftware.lirion.structure.test)

## Prerequisites
- Java 11, commands `java` and `javac`.
- iDempiere 12
- Dependencies: com.cdsoftware.pluginconfig, com.cdsoftware.payroll

## Features/Documentation
### Source Structure
```
├── com/
        ├── cdsoftware/
            ├── lirion/
                ├── structure/
                    ├── util/
                        ├── FileTemplateBuilder.java
                        ├── KeyValueLogger.java
                        ├── SqlBuilder.java
                        ├── TimestampUtil.java
                    ├── event/
                        ├── ValidateStructureValue.java
                    ├── model/
                        ├── I_CDS_AdministrativeUnit.java
                        ├── I_GH_ExpenseObject.java
                        ├── I_GH_PayrollStatus.java
                        ├── I_GH_Structure.java
                        ├── I_GH_StructurePosition.java
                        ├── I_HR_ContractTypeCategory.java
                        ├── I_HR_ContractTypeEmployee.java
                        ├── I_HR_ContractTypeSubCategory.java
                        ├── I_HR_SpecialContracts.java
                        ├── MGH_Structure.java
                        ├── X_CDS_AdministrativeUnit.java
                        ├── X_GH_ExpenseObject.java
                        ├── X_GH_PayrollStatus.java
                        ├── X_GH_Structure.java
                        ├── X_GH_StructurePosition.java
                        ├── X_HR_ContractTypeCategory.java
                        ├── X_HR_ContractTypeEmployee.java
                        ├── X_HR_ContractTypeSubCategory.java
                        ├── X_HR_SpecialContracts.java
                    ├── base/
                        ├── BundleInfo.java
                        ├── CustomCallout.java
                        ├── CustomEvent.java
                        ├── CustomForm.java
                        ├── CustomProcess.java
                    ├── callout/
                        ├── UpdateSpecialContractFields.java
                        ├── UpdateTotalSalary.java
                        ├── ValidMonthCount.java
                    ├── component/
                        ├── CalloutFactory.java
                        ├── EventFactory.java
                        ├── FormFactory.java
                        ├── ModelFactory.java
                        ├── ProcessFactory.java
```


### Events

| Target Model / Table | Event Timing / Topic | Functional Rule & Objective |
| --- | --- | --- |
| `ValidateStructureValue` | Model event triggers | Validates model state or links related records. |


### Callouts

| Callout Class | Target Field / Column | Business Validation & UI Impact |
| --- | --- | --- |
| `UpdateTotalSalary` | Calculated fields | Validates UI inputs or auto-populates dependent fields. |
| `ValidMonthCount` | Calculated fields | Validates UI inputs or auto-populates dependent fields. |
| `UpdateSpecialContractFields` | Calculated fields | Validates UI inputs or auto-populates dependent fields. |


### Generated Models

| Model | Table | Functional role |
| --- | --- | --- |
| `I_GH_StructurePosition` | `I_GH_StructurePosition` | Represents database records and implements custom business logic. |
| `I_HR_SpecialContracts` | `I_HR_SpecialContracts` | Represents database records and implements custom business logic. |
| `X_CDS_AdministrativeUnit` | `X_CDS_AdministrativeUnit` | Represents database records and implements custom business logic. |
| `X_HR_SpecialContracts` | `X_HR_SpecialContracts` | Represents database records and implements custom business logic. |
| `X_GH_PayrollStatus` | `X_GH_PayrollStatus` | Represents database records and implements custom business logic. |
| `I_HR_ContractTypeSubCategory` | `I_HR_ContractTypeSubCategory` | Represents database records and implements custom business logic. |
| `I_HR_ContractTypeCategory` | `I_HR_ContractTypeCategory` | Represents database records and implements custom business logic. |
| `X_GH_ExpenseObject` | `X_GH_ExpenseObject` | Represents database records and implements custom business logic. |
| `X_HR_ContractTypeSubCategory` | `X_HR_ContractTypeSubCategory` | Represents database records and implements custom business logic. |
| `I_CDS_AdministrativeUnit` | `I_CDS_AdministrativeUnit` | Represents database records and implements custom business logic. |
| `X_GH_StructurePosition` | `X_GH_StructurePosition` | Represents database records and implements custom business logic. |
| `X_HR_ContractTypeCategory` | `X_HR_ContractTypeCategory` | Represents database records and implements custom business logic. |
| `X_HR_ContractTypeEmployee` | `X_HR_ContractTypeEmployee` | Represents database records and implements custom business logic. |
| `I_GH_PayrollStatus` | `I_GH_PayrollStatus` | Represents database records and implements custom business logic. |
| `I_GH_ExpenseObject` | `I_GH_ExpenseObject` | Represents database records and implements custom business logic. |
| `I_GH_Structure` | `I_GH_Structure` | Represents database records and implements custom business logic. |
| `MGH_Structure` | `GH_Structure` | Represents database records and implements custom business logic. |
| `I_HR_ContractTypeEmployee` | `I_HR_ContractTypeEmployee` | Represents database records and implements custom business logic. |
| `X_GH_Structure` | `X_GH_Structure` | Represents database records and implements custom business logic. |


### Application Dictionary Metadata (2Pack)

| Package / File Name | Purpose & Dictionary Configurations |
| --- | --- |
| `2Pack_1.0.0_Windows.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_1.0.1_2PackData.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.0.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.11_IncrementalUpdate.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.2.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.3.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.4_PackOut.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.5.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.7_DontDelete.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `2Pack_2.0.8_DontDelete.zip` | Metadata package containing Application Dictionary (AD) configurations. |
| `CalloutFactory.xml` | Metadata package containing Application Dictionary (AD) configurations. |
| `EventFactory.xml` | Metadata package containing Application Dictionary (AD) configurations. |
| `FormFactory.xml` | Metadata package containing Application Dictionary (AD) configurations. |
| `ModelFactory.xml` | Metadata package containing Application Dictionary (AD) configurations. |
| `ProcessFactory.xml` | Metadata package containing Application Dictionary (AD) configurations. |
| `xml-invoice.xml` | Metadata package containing Application Dictionary (AD) configurations. |


## Instructions
1. Deploy the `com.cdsoftware.lirion.structure` OSGi bundle in your iDempiere environment.
2. Restart iDempiere and refresh OSGi bundles to register factories.
3. Configure dictionary and role access rules as needed.
