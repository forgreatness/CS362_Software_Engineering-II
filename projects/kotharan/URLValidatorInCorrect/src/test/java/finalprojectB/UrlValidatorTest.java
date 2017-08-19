/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
       System.out.println("Manual Test Function:");
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println(urlVal.isValid("h3t://www.google.com:0/test1/"));
       System.out.println(urlVal.isValid("ftp://www.amazon.com:80/test1"));
       System.out.println(urlVal.isValid("http://www.amazon.com/test1/file"));
       System.out.println(urlVal.isValid("go.com:80/test1")); //thiss one has a bug
       System.out.println(urlVal.isValid(" ftp://go.com:80/test1"));// this one has a bug
       System.out.println(urlVal.isValid("http://www.amazon.com:80/test1?action=view"));// this one has a bug
       System.out.println(urlVal.isValid("h3t://0.0.0.0/test1?action=view   "));   //this one has a bug
       System.out.println(urlVal.isValid("http://www.amazon.com:80/test1?action=view")); //this one has a bug
       System.out.println(urlVal.isValid("www.amazon.com?action=edit&mode=up")); //this one has a bug
       System.out.println();


   }
   
   
   public void testFirstPartition()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("First Test Resuts:");
       System.out.println(urlVal.isValid("http://www.goodle.com:80"));
       System.out.println(urlVal.isValid( "ftp://www.amzon.com/t123"));
       System.out.println(urlVal.isValid("http://www.zon.com:0"));
       System.out.println(urlVal.isValid("http://www.am.com:656"));
       System.out.println(urlVal.isValid("http://www.azon.com:-1")); // should be false
       System.out.println(urlVal.isValid("http://www.am.com:65636"));// there is a bug
       System.out.println(urlVal.isValid("http://www.am.com:6563"));//there is a bug

       System.out.println();

   }
   
   public void testSecondPartition(){
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("Second Test Results:");
       System.out.println(urlVal.isValid("http://www.amzon.com/t123"));
       System.out.println(urlVal.isValid("http://www.amon.com/test1/"));
       System.out.println(urlVal.isValid("http://www.aazon.com/test1"));
       System.out.println(urlVal.isValid("http://www.amn.com/test1//file"));// should be false

       System.out.println();
   }
   
   
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("For Schemes:");
       ResultPair[] testUrlScheme = {
               new ResultPair("http://", true),
               new ResultPair("ftp://", true),
               new ResultPair("h3t://", true),
               new ResultPair("3ht://", false),
               new ResultPair("http:/", false),
               new ResultPair("http:", false),
               new ResultPair("http/", false),
               new ResultPair("://", false),
               new ResultPair("", true)};  // there is a bug

	   for(int i = 0;i< testUrlScheme.length;i++)
	   {
         //  System.out.println(testUrlScheme[i].item +"www.amzon.com/t123");
           System.out.println(urlVal.isValid( testUrlScheme[i].item +"www.amzon.com/t123"));
       }

       System.out.println();
       System.out.println("For Authority:");
       ResultPair[] testUrlAuthority = {
               new ResultPair("www.google.com", true),
               new ResultPair("go.com", true),
               new ResultPair("go.au", true),
               new ResultPair("0.0.0.0", true),
               new ResultPair("255.255.255.255", true),
               new ResultPair("256.256.256.256", false), // there is a bug
               new ResultPair("255.com", true),
               new ResultPair("1.2.3.4.5", false), // there is a bug
               new ResultPair("1.2.3.4.", false),
               new ResultPair("1.2.3", false),   // there is a bug
               new ResultPair(".1.2.3.4", false),
               new ResultPair("go.a", false), //there is a bug
               new ResultPair("go.a1a", false),//there is a bug
               new ResultPair("go.cc", true),
               new ResultPair("go.1aa", false),//there is a bug
               new ResultPair("aaa.", false),
               new ResultPair(".aaa", false),
               new ResultPair("aaa", false), //there is a bug
               new ResultPair("", false)
       };

       for(int i = 0;i< testUrlAuthority.length;i++)
       {
           //  System.out.println(testUrlScheme[i].item +"www.amzon.com/t123");
           System.out.println(urlVal.isValid( "http://www."+testUrlAuthority[i].item +".com/t123"));
       }


       System.out.println();
       System.out.println("For Path");

       ResultPair[] testPath = {
               new ResultPair("/test1", true),
               new ResultPair("/t123", true),
               new ResultPair("/$23", true),
               new ResultPair("/..", false),
               new ResultPair("/../", false),
               new ResultPair("/test1/", true),
               new ResultPair("", true),
               new ResultPair("/test1/file", true),
               new ResultPair("/..//file", false),
               new ResultPair("/test1//file", false)
       };

       for(int i = 0;i< testPath.length;i++)
       {
           //  System.out.println(testUrlScheme[i].item +"www.amzon.com/t123");
           System.out.println(urlVal.isValid( "http://www.amazong.com"+testPath[i].item ));
       }
       System.out.println();
       System.out.println("For Url Query:");
       ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),  // there is a bug
               new ResultPair("?action=edit&mode=up", true),               //there is a bug
               new ResultPair("", true)
       };

       for(int i = 0;i< testUrlQuery.length;i++)
       {
           //  System.out.println(testUrlScheme[i].item +"www.amzon.com/t123");
           System.out.println(urlVal.isValid( "http://www.amazong.com"+testUrlQuery[i].item  ));
       }

   }
   
   public void testAnyOtherUnitTest()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

       System.out.println();
       System.out.println("Path options:");
       ResultPair[] testUrlPathOptions = {new ResultPair("/test1", true),
               new ResultPair("/t123", true),
               new ResultPair("/$23", true),
               new ResultPair("/..", false),
               new ResultPair("/../", false),
               new ResultPair("/test1/", true),
               new ResultPair("/#", false),
               new ResultPair("", true),
               new ResultPair("/test1/file", true),
               new ResultPair("/t123/file", true),
               new ResultPair("/$23/file", true),
               new ResultPair("/../file", false),
               new ResultPair("/..//file", false),
               new ResultPair("/test1//file", true),
               new ResultPair("/#/file", false)
       };

       for(int i = 0;i< testUrlPathOptions.length;i++)
       {
           //  System.out.println(testUrlScheme[i].item +"www.amzon.com/t123");
           System.out.println(urlVal.isValid( "http://www.amazong.com"+testUrlPathOptions[i].item ));
       }
       System.out.println();
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}





//there is a query bug ,