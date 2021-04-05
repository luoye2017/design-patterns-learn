package com.dahua.design.behavioral.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        XiaoAi xiaoAi = new XiaoAi();
        xiaoAi.setCommand("武汉天气");

        xiaoAi.answerQuestion();

        UpgradeVisitor upgradeVisitor = new UpgradeVisitor();
        xiaoAi.acceptUpgrade(upgradeVisitor);
        xiaoAi.answerQuestion();
    }
}
