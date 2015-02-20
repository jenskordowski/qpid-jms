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

import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedLong;
import org.apache.qpid.jms.test.testpeer.AmqpPeerRunnable;
import org.apache.qpid.jms.test.testpeer.FrameType;
import org.apache.qpid.jms.test.testpeer.FrameWithNoPayloadMatchingHandler;
import org.hamcrest.Matcher;

/**
 * Generated by generate-matchers.xsl, which resides in this package.
 */
public class SaslInitMatcher extends FrameWithNoPayloadMatchingHandler
{
    /** Note that the ordinals of the Field enums match the order specified in the AMQP spec */
    public enum Field
    {
        MECHANISM,
        INITIAL_RESPONSE,
        HOSTNAME,
    }

    public SaslInitMatcher()
    {
        super(FrameType.SASL,
              ANY_CHANNEL,
              UnsignedLong.valueOf(0x0000000000000041L),
              Symbol.valueOf("amqp:sasl-init:list"),
              null);
    }

    @Override
    public SaslInitMatcher onSuccess(AmqpPeerRunnable onSuccessAction)
    {
        super.onSuccess(onSuccessAction);
        return this;
    }

    public SaslInitMatcher withMechanism(Matcher<?> m)
    {
        getMatchers().put(Field.MECHANISM, m);
        return this;
    }

    public SaslInitMatcher withInitialResponse(Matcher<?> m)
    {
        getMatchers().put(Field.INITIAL_RESPONSE, m);
        return this;
    }

    public SaslInitMatcher withHostname(Matcher<?> m)
    {
        getMatchers().put(Field.HOSTNAME, m);
        return this;
    }

    public Object getReceivedMechanism()
    {
        return getReceivedFields().get(Field.MECHANISM);
    }

    public Object getReceivedInitialResponse()
    {
        return getReceivedFields().get(Field.INITIAL_RESPONSE);
    }

    public Object getReceivedHostname()
    {
        return getReceivedFields().get(Field.HOSTNAME);
    }

    @Override
    protected Enum<?> getField(int fieldIndex)
    {
        return Field.values()[fieldIndex];
    }
}

