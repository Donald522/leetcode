package leetcode.task

import spock.lang.Specification

class Task_22Spec extends Specification {

    def task

    def setup() {
        task = new Task_22()
    }

    def "test 22"() {
        when:
        def res = task.generateParenthesis(n)

        then:
        res.sort() == expected.sort()

        where:
        n | expected
        1 | ["()"]
        2 | ["()()", "(())"]
        3 | ["((()))","(()())","(())()","()(())","()()()"]
        4 | ["(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"]
    }
}
