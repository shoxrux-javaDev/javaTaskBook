package PDP.groupPractice.ExtraTask.EmailAppByLochin;

    public class Email {

        private String subject;
        private String massage;
        private User sender;
        private User receiver;
        private boolean status;

        public Email(String subject, String massage, User sender, User receiver, boolean status) {
            this.subject = subject;
            this.massage = massage;
            this.sender = sender;
            this.receiver = receiver;
            this.status = status;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getMassage() {
            return massage;
        }

        public void setMassage(String massage) {
            this.massage = massage;
        }

        public User getSender() {
            return sender;
        }

        public void setSender(User sender) {
            this.sender = sender;
        }

        public User getReceiver() {
            return receiver;
        }

        public void setReceiver(User receiver) {
            this.receiver = receiver;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }


        public String checkStatus() {
            if (status) {
                return "Unread";
            } else {
                return "Read";
            }
        }

        public String toString() {
            return   "Subject: "  + getSubject()                    +" || "+
                     "Massage: "  + getMassage()                    +" || "+
                     "Sender: "   + getSender().getEmailAddress()   +" || "+
                     "Receiver: " + getReceiver().getEmailAddress() +" || "+
                     "Status: "   + checkStatus();
        }

    }


