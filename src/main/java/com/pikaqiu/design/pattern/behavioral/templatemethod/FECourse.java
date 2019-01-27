package com.pikaqiu.design.pattern.behavioral.templatemethod;

/**
 * @author xiaoye
 */
public class FECourse extends ACourse {
    //重写父类属性
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    /**
     * 为了扩展 以后到具体的前端课程
     * 是否需要写手记 开放给调用实践层
     * needWriteArticleFlag
     * @param needWriteArticleFlag
     */
    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    /**
     * 将构造的属性 带入 重写父类方法
     * 调用本类实践时  父类就调用重写后的方法
     * @return
     */
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
