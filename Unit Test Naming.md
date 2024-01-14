# Unit Test Naming Strategies

## MethodName_StateUnderTest_ExpectedBehavior
  There is a point there should be aware that if the method name changes as part of code refactoring then this method name should be changed.
  - isAdult_AgeLessThan18_false
  - admitStudent_MissingManadatoryAreFields_FailToAdmit
## MethodName_ExpectedBehavior_StateUnderTest
  It is similar to the above strategy but it is readable
  - isAdult_False_IfAgeLessThan18
  - admitStudent_FailToAdmit_IfMandatoryFieldsAreMissing
## test[Feature being tested]
  This one makes it easy to read the test as the feature to be tested is written as part of the test name.  
  - testIsNotAnAdultIfAgeLessThen18
  - testFailToWithdrawMoneyIfAccountIsInvalid
  - testStudentIsNotAdmittedIfMandatoryFieldsAreMissing
## Feature to be tested
  - IsNotAnAdultIfAgeLessThan18
  - FailToWithdrawMoneyIfAccountIsInvalid
  - StudentIsNotAdmittedIfMandatoryFieldsAreMissing

Reference doc:
<a href="https://dzone.com/articles/7-popular-unit-test-naming">7 Popular Unit Test Naming Conventions</a>
