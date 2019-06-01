package com.js.codejam.practice.senate;

class Party implements Comparable<Party> {

    private int mParty;
    private int mNumber;

    public Party(int party, int number)
    {
        mParty = party;
        mNumber = number;
    }

    public String name() { return Character.toString((char)(64 + mParty)); }

    public Integer number() { return mNumber; }

    public void subtract() { mNumber = mNumber - 1; }

    @Override
    public int compareTo(Party that)
    {
        int compare = this.number().compareTo(that.number());
        return compare == 0 ? that.name().compareTo(this.name()) : compare;
    }
}
