public class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {

        int[] workers = new int[k];
        return dfs(jobs, workers, 0);
    }

    private int dfs(int[] jobs, int[] workers, int i) {
        if (i == jobs.length) {
            int max = Integer.MIN_VALUE;
            for (int worker : workers) {
                max = Math.max(worker, max);
            }
            return max;
        }
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < workers.length; j++) {
            workers[j] += jobs[i];
            result = Math.min(result, dfs(jobs, workers, i + 1));
            workers[j] -= jobs[i];
            if(workers[j] == 0) break;

        }
        return result;
    }
}
