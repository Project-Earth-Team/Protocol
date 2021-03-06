package com.nukkitx.protocol.genoa.packet;

import com.nukkitx.protocol.bedrock.BedrockPacket;
import com.nukkitx.protocol.bedrock.BedrockPacketType;
import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(doNotUseGetters = true, callSuper = false)
public class GenoaNetworkTransformPacket extends BedrockPacket {

    public byte byte1;
    public float f1;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
    public float f7;
    public float f8;
    public float f9;
    public float f10;
    public float f11;
    public float f12;
    public float f13;
    public float f14;
    public float f15;
    public float f16;


    @Override
    public final boolean handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }

    public BedrockPacketType getPacketType() {
        return BedrockPacketType.GENOA_NETWORK_TRANSFORM;
    }
}

