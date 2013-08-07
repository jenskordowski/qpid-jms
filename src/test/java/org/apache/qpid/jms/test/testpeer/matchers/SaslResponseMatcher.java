/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.qpid.jms.test.testpeer.matchers;

import java.util.HashMap;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedLong;
import org.apache.qpid.jms.test.testpeer.FrameType;
import org.apache.qpid.jms.test.testpeer.FrameWithNoPayloadMatchingHandler;
import org.hamcrest.Matcher;

/**
 * Generated by generate-matchers.xsl, which resides in this package.
 */
public class SaslResponseMatcher extends FrameWithNoPayloadMatchingHandler
{

    private static final int FIELD_RESPONSE = 0;

    public SaslResponseMatcher()
    {
        super(FrameType.SASL,
              ANY_CHANNEL,
              UnsignedLong.valueOf(0x0000000000000043L),
              Symbol.valueOf("amqp:sasl-response:list"),
              new HashMap<Integer, Matcher<?>>(),
              null);
    }

    @Override
    public SaslResponseMatcher onSuccess(Runnable onSuccessAction)
    {
        super.onSuccess(onSuccessAction);
        return this;
    }

    public SaslResponseMatcher withResponse(Matcher<?> m)
    {
        getMatchers().put(FIELD_RESPONSE, m);
        return this;
    }

}

