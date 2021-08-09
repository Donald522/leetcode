package leetcode.task;

import java.util.*;

/**
 * Problem #22 leetcode.com
 * <p>
 * Given n pairs of parentheses,
 * generate all combinations of well-formed parentheses.
 */
public class Task_22 {

    public List<String> generateParenthesis(int n) {
        return new ArrayList<>(_generateParenthesis(2 * n, "", new HashSet<>()));
    }

    private Collection<String> _generateParenthesis(int i, String curr, Set<String> res) {
        if (i == 0) {
            if (isValid(curr)) {
                res.add(curr);
            }

        } else {
            _generateParenthesis(i - 1, curr + "(", res);
            _generateParenthesis(i - 1, curr + ")", res);
        }
        return res;
    }

    private boolean isValid(String generated) {
        char open = '(';
        char close = ')';
        int stack = 0;
        for (char parenthese : generated.toCharArray()) {
            if (parenthese == open) {
                stack++;
            } else if (parenthese == close) {
                if (stack == 0) {
                    return false;
                }
                stack--;
            }
        }
        return stack == 0;
    }
}