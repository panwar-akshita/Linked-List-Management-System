/** Singly linked list implemented with custom nodes. */
public class SinglyLinkedList {
    private static class Node { int data; Node next; Node(int d){data=d;} }
    private Node head;
    public void insertAtBeginning(int v){Node n=new Node(v);n.next=head;head=n;}
    public void insertAtEnd(int v){Node n=new Node(v);if(head==null){head=n;return;}Node c=head;while(c.next!=null)c=c.next;c.next=n;}
    public boolean insertAtPosition(int v,int p){if(p<1)return false;if(p==1){insertAtBeginning(v);return true;}Node c=head;for(int i=1;c!=null&&i<p-1;i++)c=c.next;if(c==null)return false;Node n=new Node(v);n.next=c.next;c.next=n;return true;}
    public boolean insertAfter(int target,int v){Node c=find(target);if(c==null)return false;Node n=new Node(v);n.next=c.next;c.next=n;return true;}
    public boolean insertBefore(int target,int v){if(head==null)return false;if(head.data==target){insertAtBeginning(v);return true;}Node c=head;while(c.next!=null&&c.next.data!=target)c=c.next;if(c.next==null)return false;Node n=new Node(v);n.next=c.next;c.next=n;return true;}
    public boolean deleteFromBeginning(){if(head==null)return false;head=head.next;return true;}
    public boolean deleteFromEnd(){if(head==null)return false;if(head.next==null){head=null;return true;}Node c=head;while(c.next.next!=null)c=c.next;c.next=null;return true;}
    public boolean deleteAtPosition(int p){if(p<1||head==null)return false;if(p==1)return deleteFromBeginning();Node c=head;for(int i=1;c.next!=null&&i<p-1;i++)c=c.next;if(c.next==null)return false;c.next=c.next.next;return true;}
    public boolean deleteByValue(int v){if(head==null)return false;if(head.data==v)return deleteFromBeginning();Node c=head;while(c.next!=null&&c.next.data!=v)c=c.next;if(c.next==null)return false;c.next=c.next.next;return true;}
    public int search(int v){int p=1;for(Node c=head;c!=null;c=c.next,p++)if(c.data==v)return p;return -1;}
    public boolean update(int oldV,int newV){Node n=find(oldV);if(n==null)return false;n.data=newV;return true;}
    public void display(){StringBuilder b=new StringBuilder("[HEAD] -> ");for(Node c=head;c!=null;c=c.next)b.append("[").append(c.data).append("] -> ");System.out.println(b.append("NULL"));}
    public int count(){int n=0;for(Node c=head;c!=null;c=c.next)n++;return n;}
    public Integer maximum(){if(head==null)return null;int v=head.data;for(Node n=head.next;n!=null;n=n.next)if(n.data>v)v=n.data;return v;}
    public Integer minimum(){if(head==null)return null;int v=head.data;for(Node n=head.next;n!=null;n=n.next)if(n.data<v)v=n.data;return v;}
    public Integer middle(){if(head==null)return null;Node s=head,f=head;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}return s.data;}
    public void reverse(){Node prev=null,c=head;while(c!=null){Node next=c.next;c.next=prev;prev=c;c=next;}head=prev;}
    public void bubbleSort(){for(Node end=null;end!=head;){boolean changed=false;Node c=head;while(c.next!=end){if(c.data>c.next.data){int t=c.data;c.data=c.next.data;c.next.data=t;changed=true;}c=c.next;}if(!changed)break;end=c;}}
    public void removeDuplicates(){for(Node c=head;c!=null;c=c.next){Node r=c;while(r.next!=null){if(r.next.data==c.data)r.next=r.next.next;else r=r.next;}}}
    private Node find(int v){for(Node n=head;n!=null;n=n.next)if(n.data==v)return n;return null;}
}