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

package org.apache.pluto.spi.impl;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pluto.container.PortletContainer;
import org.apache.pluto.container.PortletWindow;
import org.apache.pluto.container.spi.optional.PortletResourceResponseContext;

/**
 * @version $Id$
 *
 */
public class PortletResourceResponseContextImpl extends PortletMimeResponseContextImpl implements
                PortletResourceResponseContext
{
    
    public PortletResourceResponseContextImpl(PortletContainer container, HttpServletRequest request,
                                              HttpServletResponse response, PortletWindow window)
    {
        super(container, request, response, window);
    }

    /* (non-Javadoc)
     * @see org.apache.pluto.spi.optional.PortletResourceResponseContext#setCharacterEncoding(java.lang.String)
     */
    public void setCharacterEncoding(String charset)
    {
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see org.apache.pluto.spi.optional.PortletResourceResponseContext#setContentLength(int)
     */
    public void setContentLength(int len)
    {
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see org.apache.pluto.spi.optional.PortletResourceResponseContext#setLocale(java.util.Locale)
     */
    public void setLocale(Locale locale)
    {
        // TODO Auto-generated method stub
    }
}
