package com.example.lolhistory.model;

import com.google.gson.annotations.SerializedName;

public class SummonerRankInfo {
    @SerializedName("summonerName")
    private String summonerName;

    @SerializedName("queueType")
    private String queueType;

    @SerializedName("tier")
    private String tier;

    @SerializedName("rank")
    private String rank;

    @SerializedName("leaguePoints")
    private String leaguePoints;

    @SerializedName("wins")
    private int wins;

    @SerializedName("losses")
    private int losses;

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(String leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}