/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle licenses this file to You under the Apache License, Version 2.0
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

package org.codehaus.mojo.jaxws.it;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * A web service implementation class.
 * 
 * @author Dan T. Tran
 * 
 */
@WebService(name = "HelloWorldComplex", serviceName = "HelloWorldComplexService")
public class HelloWorldComplexImpl {

	@WebMethod()
	public HelloObject helloWorldComplex(HelloObject userName) {
		HelloObject helloObject = new HelloObject();
		helloObject.setName1("name 1");
		helloObject.setName2("name 2");
		return helloObject;
	}
}
