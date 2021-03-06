/**
 * Copyright 2016-2017 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.nukleus.http_cache.internal.proxy.request;

import org.reaktivity.nukleus.buffer.BufferPool;
import org.reaktivity.nukleus.function.MessageConsumer;
import org.reaktivity.nukleus.route.RouteManager;

public class OnUpdateRequest extends AnswerableByCacheRequest
{

    public OnUpdateRequest(
        String acceptName,
        MessageConsumer acceptReply,
        long acceptReplyStreamId,
        long acceptCorrelationId,
        BufferPool responseBufferPool,
        BufferPool requestBufferPool,
        int requestSlot,
        int requestSize,
        RouteManager router,
        int requestURLHash,
        short authScope,
        String etag)
    {
        super(
            acceptName,
            acceptReply,
            acceptReplyStreamId,
            acceptCorrelationId,
            router,
            requestBufferPool,
            requestSlot,
            requestSize,
            requestURLHash,
            authScope,
            etag);
    }

    @Override
    public Type getType()
    {
        return Type.ON_UPDATE;
    }

}
