package com.nukkitx.protocol.genoa.packet;

import com.nukkitx.protocol.bedrock.BedrockPacket;
import com.nukkitx.protocol.bedrock.BedrockPacketType;
import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(doNotUseGetters = true, callSuper = false)
public class GenoaBlockDestroyPacket extends BedrockPacket {

    public long UnsignedVarLong;
    public long UnsignedLong;
    public long UnsignedLong2;

    @Override
    public final boolean handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }

    public BedrockPacketType getPacketType() {
        return BedrockPacketType.GENOA_DESTROY_BLOCK;
    }
}
