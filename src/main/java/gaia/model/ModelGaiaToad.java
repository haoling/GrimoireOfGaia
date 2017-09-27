package gaia.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaToad extends ModelGaia {

    ModelRenderer head;
    ModelRenderer headeyes;
    ModelRenderer headaccessory;
    ModelRenderer neck;
    ModelRenderer bodytop;
    ModelRenderer bodymiddle;
    ModelRenderer bodymiddlebutton;
    ModelRenderer bodybottom;
    ModelRenderer rightchest;
    ModelRenderer leftchest;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer headrighteye;
    ModelRenderer headlefteye;
    ModelRenderer necktie;
    ModelRenderer necktietip;
    ModelRenderer rightarmlower;
    ModelRenderer leftarmlower;
    ModelRenderer tail;
    ModelRenderer rightleglower;
    ModelRenderer leftleglower;

    public ModelGaiaToad() {
        this.textureWidth = 128;
        this.textureHeight = 64;

        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
        this.head.setRotationPoint(0F, 13F, -8F);
        this.head.setTextureSize(64, 32);
        this.setRotation(head, 0F, 0F, 0F);
        this.headeyes = new ModelRenderer(this, 24, 0);
        this.headeyes.addBox(-3F, -6F, -3F, 6, 6, 0);
        this.headeyes.setRotationPoint(0F, 13F, -8F);
        this.headeyes.setTextureSize(64, 32);
        this.setRotation(headeyes, 0F, 0F, 0F);
        this.headaccessory = new ModelRenderer(this, 36, 0);
        this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
        this.headaccessory.setRotationPoint(0F, 13F, -8F);
        this.headaccessory.setTextureSize(64, 32);
        this.setRotation(headaccessory, 0F, 0F, 0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.neck.setRotationPoint(0F, 13F, -8F);
        this.neck.setTextureSize(64, 32);
        this.setRotation(neck, 1.134464F, 0F, 0F);
        this.bodytop = new ModelRenderer(this, 0, 16);
        this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
        this.bodytop.setRotationPoint(0F, 13F, -8F);
        this.bodytop.setTextureSize(64, 32);
        this.setRotation(bodytop, 1.134464F, 0F, 0F);
        this.bodymiddle = new ModelRenderer(this, 0, 25);
        this.bodymiddle.addBox(-2F, 5.5F, -1.5F, 4, 3, 2);
        this.bodymiddle.setRotationPoint(0F, 13F, -8F);
        this.bodymiddle.setTextureSize(64, 32);
        this.setRotation(bodymiddle, 1.22173F, 0F, 0F);
        this.bodymiddlebutton = new ModelRenderer(this, 0, 25);
        this.bodymiddlebutton.addBox(-0.5F, 6F, -1.6F, 1, 2, 0);
        this.bodymiddlebutton.setRotationPoint(0F, 13F, -8F);
        this.bodymiddlebutton.setTextureSize(64, 32);
        this.setRotation(bodymiddlebutton, 1.22173F, 0F, 0F);
        this.bodybottom = new ModelRenderer(this, 0, 30);
        this.bodybottom.addBox(-3F, 8F, -2.5F, 6, 3, 3);
        this.bodybottom.setRotationPoint(0F, 13F, -8F);
        this.bodybottom.setTextureSize(64, 32);
        this.setRotation(bodybottom, 1.308997F, 0F, 0F);
        this.rightchest = new ModelRenderer(this, 0, 36);
        this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.rightchest.setRotationPoint(-1.3F, 15F, -7F);
        this.rightchest.setTextureSize(64, 32);
        this.setRotation(rightchest, 1.919862F, -0.0872665F, 0.0872665F);
        this.leftchest = new ModelRenderer(this, 0, 36);
        this.leftchest.mirror = true;
        this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.leftchest.setRotationPoint(1.3F, 15F, -7F);
        this.leftchest.setTextureSize(64, 32);
        this.setRotation(leftchest, 1.919862F, 0.0872665F, -0.0872665F);
        this.rightarm = new ModelRenderer(this, 16, 12);
        this.rightarm.addBox(-2F, -1F, -1F, 2, 6, 2);
        this.rightarm.setRotationPoint(-2.5F, 14F, -7F);
        this.rightarm.setTextureSize(64, 32);
        this.setRotation(rightarm, 0F, 0F, 0.2617994F);
        this.leftarm = new ModelRenderer(this, 16, 12);
        this.leftarm.mirror = true;
        this.leftarm.addBox(0F, -1F, -1F, 2, 6, 2);
        this.leftarm.setRotationPoint(2.5F, 14F, -7F);
        this.leftarm.setTextureSize(64, 32);
        this.setRotation(leftarm, 0F, 0F, -0.2617994F);
        this.rightleg = new ModelRenderer(this, 24, 12);
        this.rightleg.addBox(-1.5F, -1F, -1.5F, 3, 7, 3);
        this.rightleg.setRotationPoint(-2.5F, 16.8F, 2F);
        this.rightleg.setTextureSize(64, 32);
        this.setRotation(rightleg, -1.047198F, 0.5235988F, 0F);
        this.leftleg = new ModelRenderer(this, 24, 12);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-1.5F, -1F, -1.5F, 3, 7, 3);
        this.leftleg.setRotationPoint(2.5F, 16.8F, 2F);
        this.leftleg.setTextureSize(64, 32);
        this.setRotation(leftleg, -1.047198F, -0.5235988F, 0F);
        this.headrighteye = new ModelRenderer(this, 36, 14);
        this.headrighteye.addBox(-2.5F, -7.5F, -1.5F, 3, 3, 3);
        this.headrighteye.setRotationPoint(-2F, 13F, -8F);
        this.headrighteye.setTextureSize(64, 32);
        this.setRotation(headrighteye, 0F, 0F, 0F);
        this.headlefteye = new ModelRenderer(this, 36, 14);
        this.headlefteye.mirror = true;
        this.headlefteye.addBox(3.5F, -7.5F, -1.5F, 3, 3, 3);
        this.headlefteye.setRotationPoint(-2F, 13F, -8F);
        this.headlefteye.setTextureSize(64, 32);
        this.setRotation(headlefteye, 0F, 0F, 0F);
        this.necktie = new ModelRenderer(this, 36, 20);
        this.necktie.addBox(-1F, 0.5F, -1.4F, 2, 2, 0);
        this.necktie.setRotationPoint(0F, 13F, -8F);
        this.necktie.setTextureSize(64, 32);
        this.setRotation(necktie, 0F, 0F, 0F);
        this.necktietip = new ModelRenderer(this, 36, 22);
        this.necktietip.addBox(-1F, 2.5F, -1.9F, 2, 2, 1);
        this.necktietip.setRotationPoint(0F, 13F, -8F);
        this.necktietip.setTextureSize(64, 32);
        this.setRotation(necktietip, 0F, 0F, 0F);
        this.rightarmlower = new ModelRenderer(this, 16, 20);
        this.rightarmlower.addBox(-4.25F, 3.5F, -1F, 2, 6, 2);
        this.rightarmlower.setRotationPoint(-2.5F, 14F, -7F);
        this.rightarmlower.setTextureSize(64, 32);
        this.setRotation(rightarmlower, 0F, 0F, -0.2617994F);
        this.leftarmlower = new ModelRenderer(this, 16, 20);
        this.leftarmlower.mirror = true;
        this.leftarmlower.addBox(2.25F, 3.5F, -1F, 2, 6, 2);
        this.leftarmlower.setRotationPoint(2.5F, 14F, -7F);
        this.leftarmlower.setTextureSize(64, 32);
        this.setRotation(leftarmlower, 0F, 0F, 0.2617994F);
        this.tail = new ModelRenderer(this, 36, 25);
        this.tail.addBox(-3.5F, 9F, -1F, 7, 5, 2);
        this.tail.setRotationPoint(0F, 13F, -8F);
        this.tail.setTextureSize(64, 32);
        this.setRotation(tail, 1.308997F, 0F, 0F);
        this.rightleglower = new ModelRenderer(this, 24, 22);
        this.rightleglower.addBox(-1.5F, -3F, -6.5F, 3, 7, 3);
        this.rightleglower.setRotationPoint(-2.5F, 16.8F, 2F);
        this.rightleglower.setTextureSize(64, 32);
        this.setRotation(rightleglower, 1.047198F, 0.5235988F, 0F);
        this.leftleglower = new ModelRenderer(this, 24, 22);
        this.leftleglower.mirror = true;
        this.leftleglower.addBox(-1.5F, -3F, -6.5F, 3, 7, 3);
        this.leftleglower.setRotationPoint(2.5F, 16.8F, 2F);
        this.leftleglower.setTextureSize(64, 32);
        this.setRotation(leftleglower, 1.047198F, -0.5235988F, 0F);

        this.convertToChild(head, headaccessory);
        this.convertToChild(head, headrighteye);
        this.convertToChild(head, headlefteye);
        this.convertToChild(necktie, necktietip);
        this.convertToChild(rightarm, rightarmlower);
        this.convertToChild(leftarm, leftarmlower);
        this.convertToChild(rightleg, rightleglower);
        this.convertToChild(leftleg, leftleglower);
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.head.render(scale);
        // this.headaccessory.render(scale);
        this.neck.render(scale);
        this.bodytop.render(scale);
        this.bodymiddle.render(scale);
        this.bodymiddlebutton.render(scale);
        this.bodybottom.render(scale);
        this.rightchest.render(scale);
        this.leftchest.render(scale);
        this.rightarm.render(scale);
        this.leftarm.render(scale);
        this.rightleg.render(scale);
        this.leftleg.render(scale);
        // this.headrighteye.render(scale);
        // this.headlefteye.render(scale);
        this.necktie.render(scale);
        // this.necktietip.render(scale);
        // this.rightarmlower.render(scale);
        // this.leftarmlower.render(scale);
        this.tail.render(scale);
        // this.rightleglower.render(scale);
        // this.leftleglower.render(scale);

        if (entityIn.ticksExisted % 60 == 0 && limbSwingAmount <= 0.1F) {
            this.headeyes.render(scale);
        }
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor,
            Entity entityIn) {
        // head
        this.head.rotateAngleY = netHeadYaw / 57.295776F;
        this.head.rotateAngleX = headPitch / 57.295776F;
        this.headeyes.rotateAngleY = this.head.rotateAngleY;
        this.headeyes.rotateAngleX = this.head.rotateAngleX;
        // this.headaccessory.rotateAngleY = this.head.rotateAngleY;
        // this.headaccessory.rotateAngleX = this.head.rotateAngleX;

        if (this.swingProgress > -9990.0F) {
            holdingMelee(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        }

        // arms
        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount * 0.5F;

        this.rightarm.rotateAngleZ = 0.2617994F;
        this.leftarm.rotateAngleZ = -0.2617994F;

        // body
        float f = ageInTicks * (float) Math.PI * -0.1F;
        f = 0.47123894F + ageInTicks * (float) Math.PI * -0.05F;

        for (int k = 1; k < 2; ++k) {
            this.necktie.rotateAngleZ = MathHelper.cos((((float) k * 1.5F + ageInTicks)) * 0.1F) / 16;
            ++f;
        }

        // legs
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.2F * limbSwingAmount;
        this.rightleg.rotateAngleX -= 1.047198F;
        this.leftleg.rotateAngleX -= 1.047198F;
    }

    public void holdingMelee(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor,
            Entity entityIn) {
        float f6;
        float f7;

        f6 = this.swingProgress;
        f6 = 1.0F - this.swingProgress;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float) Math.PI);
        float f8 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;

        this.head.rotateAngleX -= (float) ((double) this.head.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
    }
}
