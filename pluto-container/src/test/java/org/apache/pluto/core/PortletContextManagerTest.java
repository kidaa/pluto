/*
 * Copyright 2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.core;

import junit.framework.TestCase;

import javax.servlet.ServletContext;

/* Java 5 req'd
 import org.easymock.EasyMock;
*/

import java.net.MalformedURLException;
import java.net.URL;


public class PortletContextManagerTest extends TestCase {

    private PortletContextManager manager;
    private ServletContext context;

    public void setUp() {
        /* Java5 Required!
        context = EasyMock.createMock(ServletContext.class);
        */
        manager = PortletContextManager.getManager();
    }

    public void testComputeContextPath() throws MalformedURLException {
        /* Java5 Required!
            URL url = new URL("file://usr/local/apache-tomcat-5.1.19/webapps/my-test-context/WEB-INF/web.xml");
            EasyMock.expect(context.getResource("/WEB-INF/web.xml")).andReturn(url);
            EasyMock.replay(context);
            assertEquals("/my-test-context", manager.computeContextPath(context));
            EasyMock.verify(context);


            EasyMock.reset(context);
            url = new URL("file://usr/local/apache-tomcat-5.1.19/webapps/my-test-context.war!/WEB-INF/web.xml");
            EasyMock.expect(context.getResource("/WEB-INF/web.xml")).andReturn(url);
            EasyMock.replay(context);
            assertEquals("/my-test-context", manager.computeContextPath(context));
        */
        }
}
