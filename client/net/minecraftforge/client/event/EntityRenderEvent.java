package net.minecraftforge.client.event;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event;

@Cancelable
public class EntityRenderEvent extends Event {
    public Render render;
    public Entity entity;
    public double x,y,z;
    public float yaw;
    public float partialTickTime;
    public EntityRenderEvent(Render render, Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
        this.render = render;
        this.entity=entity;
        this.x=x;
        this.y=y;
        this.z=z;
        this.yaw=yaw;
        this.partialTickTime=partialTickTime;
    }
}
