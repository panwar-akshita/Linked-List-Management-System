/** Doubly linked list with custom nodes and maintained head and tail. */
public class DoublyLinkedList {
    private static class Node{int data;Node prev,next;Node(int d){data=d;}}
    private Node head,tail;
    public void insertAtBeginning(int v){Node n=new Node(v);
        if(head==null)head=tail=n;else{n.next=head;head.prev=n;head=n;}}
    public void insertAtEnd(int v){Node n=new Node(v);if(tail==null)head=tail=n;else{n.prev=tail;tail.next=n;tail=n;}}
    public boolean insertAtPosition(int v,int p){if(p<1)return false;if(p==1){insertAtBeginning(v);return true;}Node c=head;for(int i=1;c!=null&&i<p;i++)c=c.next;if(c==null){if(p==count()+1){insertAtEnd(v);return true;}return false;}Node n=new Node(v);n.prev=c.prev;n.next=c;c.prev.next=n;c.prev=n;return true;}
    public boolean insertAfter(int x,int v){Node c=find(x);if(c==null)return false;if(c==tail){insertAtEnd(v);return true;}Node n=new Node(v);n.prev=c;n.next=c.next;c.next.prev=n;c.next=n;return true;}
    public boolean insertBefore(int x,int v){Node c=find(x);if(c==null)return false;if(c==head){insertAtBeginning(v);return true;}Node n=new Node(v);n.next=c;n.prev=c.prev;c.prev.next=n;c.prev=n;return true;}
    public boolean deleteFromBeginning(){if(head==null)return false;if(head==tail)head=tail=null;else{head=head.next;head.prev=null;}return true;}
    public boolean deleteFromEnd(){if(tail==null)return false;if(head==tail)head=tail=null;else{tail=tail.prev;tail.next=null;}return true;}
    public boolean deleteAtPosition(int p){if(p<1)return false;Node n=nodeAt(p);if(n==null)return false;unlink(n);return true;}
    public boolean deleteByValue(int v){Node n=find(v);if(n==null)return false;unlink(n);return true;}
    private void unlink(Node n){if(n==head)head=n.next;else n.prev.next=n.next;if(n==tail)tail=n.prev;else n.next.prev=n.prev;if(head!=null)head.prev=null;if(tail!=null)tail.next=null;}
    public int search(int v){int p=1;for(Node n=head;n!=null;n=n.next,p++)if(n.data==v)return p;return -1;}
    public boolean update(int x,int v){Node n=find(x);if(n==null)return false;n.data=v;return true;}
    public void displayForward(){if(head==null){System.out.println("NULL");return;}StringBuilder b=new StringBuilder("NULL <- ");for(Node n=head;n!=null;n=n.next){b.append("[").append(n.data).append("]");if(n.next!=null)b.append(" <-> ");}System.out.println(b.append(" -> NULL"));}
    public void displayBackward(){if(tail==null){System.out.println("NULL");return;}StringBuilder b=new StringBuilder("NULL <- ");for(Node n=tail;n!=null;n=n.prev){b.append("[").append(n.data).append("]");if(n.prev!=null)b.append(" <-> ");}System.out.println(b.append(" -> NULL"));}
    public int count(){int x=0;for(Node n=head;n!=null;n=n.next)x++;return x;}
    public Integer maximum(){if(head==null)return null;int v=head.data;for(Node n=head.next;n!=null;n=n.next)if(n.data>v)v=n.data;return v;}
    public Integer minimum(){if(head==null)return null;int v=head.data;for(Node n=head.next;n!=null;n=n.next)if(n.data<v)v=n.data;return v;}
    public Integer middle(){if(head==null)return null;Node s=head,f=head;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}return s.data;}
    public void reverse(){Node c=head;while(c!=null){Node next=c.next;c.next=c.prev;c.prev=next;c=next;}Node old=head;head=tail;tail=old;}
    public void bubbleSort(){for(Node end=null;end!=head;){boolean changed=false;Node n=head;while(n.next!=end){if(n.data>n.next.data){int t=n.data;n.data=n.next.data;n.next.data=t;changed=true;}n=n.next;}if(!changed)break;end=n;}}
    public void removeDuplicates(){for(Node n=head;n!=null;n=n.next){Node r=n.next;while(r!=null){Node next=r.next;if(r.data==n.data)unlink(r);r=next;}}}
    private Node find(int v){for(Node n=head;n!=null;n=n.next)if(n.data==v)return n;return null;}
    private Node nodeAt(int p){Node n=head;for(int i=1;n!=null&&i<p;i++)n=n.next;return n;}
}