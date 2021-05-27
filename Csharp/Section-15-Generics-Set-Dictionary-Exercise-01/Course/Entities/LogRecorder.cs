using System;

namespace Course.Entities
{
    class LogRecorder
    {
        public string Username { get; set; }
        public DateTime Instant { get; set; }

        public LogRecorder(string name, DateTime instant)
        {
            Username = name;
            Instant = instant;
        }

        public override int GetHashCode()
        {
            return Username.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            if (!(obj is LogRecorder))
            {
                return false;
            }
            LogRecorder other = obj as LogRecorder;
            return Username.Equals(other.Username);
        }
    }
}
