package com.Trie;
class TrieNode
{
    char data;
    boolean isTerminating;
    TrieNode children[];
    public TrieNode(char data)
    {
        this.data=data;
        isTerminating=false;
        children=new TrieNode[26];
    }
}
public class Trie {
     private TrieNode root;
    public Trie()
    {
        root = new TrieNode('\0');
    }
    private void add(TrieNode root,String word)
    {
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
        {
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
        }
        add(child,word.substring(1));
    }
    public void add(String word) {
        add(root,word);
    }
}
