    Node* removeDuplicates(Node* head) {

        // code here
        if(head==NULL)return head;
        Node*curr=head;
        while(curr!=NULL &&curr->next!=NULL){
            
            if(curr->data==curr->next->data){
                Node*temp;
                temp=curr->next;
                curr->next=curr->next->next;
                delete temp;
            }
            else{
            curr=curr->next;
                
            }
        }
        return head;
    }