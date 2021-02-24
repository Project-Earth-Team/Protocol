package com.nukkitx.protocol.genoa.packet;

import com.nukkitx.protocol.bedrock.BedrockPacket;
import com.nukkitx.protocol.bedrock.BedrockPacketType;
import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(doNotUseGetters = true, callSuper = false)
public class GenoaItemAwardedNotificationPacket extends BedrockPacket {

    public String String1;
    public String String2;
    public String String3;
    // Loop:
    // public int UnsignedInt;
    // public int Int;
    // public long UnsignedLong1;
    // public long UnsignedLong2;

    @Override
    public final boolean handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }

    public BedrockPacketType getPacketType() {
        return BedrockPacketType.GENOA_ITEM_AWARDED_NOTIFICATION;
    }
}
