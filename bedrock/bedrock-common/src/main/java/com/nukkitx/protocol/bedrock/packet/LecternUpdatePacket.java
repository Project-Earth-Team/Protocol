package com.nukkitx.protocol.bedrock.packet;

import com.flowpowered.math.vector.Vector3i;
import com.nukkitx.protocol.bedrock.BedrockPacket;
import com.nukkitx.protocol.bedrock.handler.BedrockPacketHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class LecternUpdatePacket extends BedrockPacket {
    private int page;
    private Vector3i blockPosition;
    private boolean unknownBool;

    @Override
    public boolean handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }
}
