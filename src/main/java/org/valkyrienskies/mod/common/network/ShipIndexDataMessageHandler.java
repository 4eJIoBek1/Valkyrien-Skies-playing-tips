package org.valkyrienskies.mod.common.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ShipIndexDataMessageHandler implements IMessageHandler<ShipIndexDataMessage, IMessage> {

    @Override
    public IMessage onMessage(ShipIndexDataMessage message, MessageContext ctx) {
        System.out.println("Lol" + message.indexedData.size());
        return null;
    }
}
