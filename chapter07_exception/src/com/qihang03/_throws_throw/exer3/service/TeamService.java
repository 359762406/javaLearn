package com.qihang03._throws_throw.exer3.service;

import com.qihang03._throws_throw.exer3.domain.Architect;
import com.qihang03._throws_throw.exer3.domain.Designer;
import com.qihang03._throws_throw.exer3.domain.Employee;
import com.qihang03._throws_throw.exer3.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: com.qihang03._throws_throw.exer3.service
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:07
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; // 给memberId进行自动赋值的基数
    private final int MAX_MEMBER = 5; // 团队最大人数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < this.total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * @param employee
     * @throws TeamException
     */
    public void addMember(Employee employee) throws TeamException {
        if (this.total > MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        Programmer p1 = null;
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发成员，无法添加");
        } else if (employee instanceof Programmer) {
            p1 = (Programmer) employee;
            Status status = p1.getStatus();
            switch (status) {
                case BUSY -> throw new TeamException("该员工已经在某团队中");
                case VOCATION -> throw new TeamException("该员工正在休假中");
            }
            boolean isExist = isExist(p1);
            if (isExist) {
                throw new TeamException("该成员已经存在");
            }
        }
        //记录程序员，设计师，架构师
        int progNum = 0, desNum = 0, arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else if (team[i] instanceof Programmer) {
                progNum++;
            }
        }
        if (p1 instanceof Architect) {
            if (arcNum >= 1) {
                throw new TeamException("团队中至多有一名架构师");
            }
        }
        if (p1 instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("团队中至多有两名设计师");
            }
        }
        if (p1 instanceof Programmer) {
            if (progNum >= 3){
                throw new TeamException("团队中至多有三名程序员");

            }
        }
        team[total ++ ] = p1;
        p1.setMemberId(counter ++ );
        p1.setStatus(Status.BUSY);




    }

    /**
     * @param programmer
     * @return
     */
    public boolean isExist(Programmer programmer) {
        for (int i = 0; i < this.total; i++) {
            if (team[i].getId() == programmer.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < this.total; i++) {
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);

                break;
            }
        }
        if (i == total){
            throw new TeamException("找不到指定memberId的员工，册除失败");
        }
        //调整数组
        for (int j = i; j < total - 1;j ++){
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
